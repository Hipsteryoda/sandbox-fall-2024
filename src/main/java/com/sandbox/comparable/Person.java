// create a class Person that is comparable to other Person objects
// include state for firstName, lastName, and age
// include appropriate constructors, getters, and setters

package com.sandbox.comparable;

public class Person implements Comparable<Person> {

  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = 0;
  }

  private Person() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // change the compareTo method to compare the last name, then the first name, then the age
  @Override
  public int compareTo(Person that) {
    //if (this.lastName.compareTo(that.lastName) > 0) {
    //  return 1;
    //} else if (this.lastName.compareTo(that.lastName) < 0) {
    //  return -1;
    //} else {
    //  if (this.firstName.compareTo(that.firstName) > 0) {
    //    return 1;
    //  } else if (this.firstName.compareTo(that.firstName) < 0) {
    //    return -1;
    //  } else {
    //    if (this.age > that.age) {
    //      return 1;
    //    } else if (this.age < that.age) {
    //      return -1;
    //    }
    //  }
    //}
    //return 0;
    int lastNameComparison = this.lastName.compareTo(that.lastName);
    if (lastNameComparison != 0) {
      return lastNameComparison;
    }

    int firstNameComparison = this.firstName.compareTo(that.firstName);
    if (firstNameComparison != 0) {
      return firstNameComparison;
    }

    return Integer.compare(this.age, that.age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("{ First Name: ");
    sb.append(firstName);
    sb.append(", Last Name: ");
    sb.append(lastName);
    sb.append(", Age: ");
    sb.append(age);
    sb.append(" }");
    return sb.toString();
  }
}

