package de.diedavids.jmix.wizard.example.entity.orderline;

import io.jmix.ui.screen.*;
import de.diedavids.jmix.wizard.example.entity.OrderLine;

@UiController("OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
public class OrderLineEdit extends StandardEditor<OrderLine> {
}