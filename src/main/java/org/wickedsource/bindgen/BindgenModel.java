package org.wickedsource.bindgen;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.bindgen.java.lang.StringBindingPath;

public class BindgenModel<T> extends PropertyModel<T> {

	public BindgenModel(Object modelObject, StringBindingPath<T> path) {
		super(modelObject, path.getPath());
	}

	public static <T> IModel<T> of(Object modelObject, StringBindingPath<T> path) {
		PropertyModel<T> model = new PropertyModel<T>(modelObject,
				path.getPath());
		return model;
	}

}
