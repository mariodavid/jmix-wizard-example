package de.diedavids.jmix.wizard.example.entity.order;

import io.jmix.ui.screen.*;
import de.diedavids.jmix.wizard.example.entity.Order;

@UiController("Order_.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
public class OrderBrowse extends StandardLookup<Order> {
}