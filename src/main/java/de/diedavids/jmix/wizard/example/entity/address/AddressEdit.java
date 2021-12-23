package de.diedavids.jmix.wizard.example.entity.address;

import io.jmix.ui.screen.*;
import de.diedavids.jmix.wizard.example.entity.Address;

@UiController("Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
public class AddressEdit extends StandardEditor<Address> {
}