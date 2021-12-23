package de.diedavids.jmix.wizard.example.entity.customer;

import io.jmix.ui.screen.*;
import de.diedavids.jmix.wizard.example.entity.Customer;

@UiController("Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}