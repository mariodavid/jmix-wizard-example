package de.diedavids.jmix.wizard.example.entity.product;

import de.diedavids.jmix.wizard.example.entity.Product;
import io.jmix.ui.screen.*;

@UiController("Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
public class ProductEdit extends StandardEditor<Product> {
}