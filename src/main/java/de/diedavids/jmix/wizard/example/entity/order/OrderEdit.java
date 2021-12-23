package de.diedavids.jmix.wizard.example.entity.order;

import de.diedavids.jmix.wizard.example.entity.Order;
import io.jmix.ui.screen.*;

@UiController("Order_.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {
}