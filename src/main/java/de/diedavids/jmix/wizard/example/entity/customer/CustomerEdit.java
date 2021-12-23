package de.diedavids.jmix.wizard.example.entity.customer;

import io.jmix.ui.screen.*;
import de.diedavids.jmix.wizard.example.entity.Customer;

@UiController("Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
}