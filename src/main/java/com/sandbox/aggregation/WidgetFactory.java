package com.sandbox.aggregation;

import java.util.List;
import java.util.ArrayList;

public class WidgetFactory {

  private List<Widget> widgets = new ArrayList<Widget>();

  public WidgetFactory() {
    this.widgets = new Widget();
  }

  public addWidget(Widget widget) {
    widgets.add(widget);
  }

}
