package de.diedavids.jmix.wizard.example.entity.product;

import de.diedavids.jmix.wizard.example.entity.Product;
import io.jmix.ui.screen.*;

@UiController("Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
public class ProductBrowse extends StandardLookup<Product> {
}