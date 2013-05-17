package org.wickedsource;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.PropertyModel;
import org.wickedsource.bindgen.BindgenModel;
import org.wickedsource.domain.Address;
import org.wickedsource.domain.Person;
import org.wickedsource.domain.PersonBinding;
import org.wickedsource.domain.State;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		State state = new State();
		state.setCode("NRW");
		state.setName("Nordrhein-Westfalen");

		Address address = new Address();
		address.setPostCode("44269");
		address.setStreet("Stockholmer Allee 24");
		address.setState(state);

		Person person = new Person();
		person.setFirstName("Tom");
		person.setLastName("Hombergs");
		person.setAge(30);
		person.setAddress(address);

		add(new Label("stateCode", BindgenModel.of(person, new PersonBinding()
				.address().state().code())));

	}
}
