package validate;

import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.validator.AbstractValidator;

public class NotEmpty extends AbstractValidator {

	@Override
	public void validate(ValidationContext ctx) {
		// TODO Auto-generated method stub
		Object value = ctx.getProperty().getValue();
		System.out.println(value);
		if(value != null || value.toString().isEmpty()) {
			addInvalidMessage(ctx, "Not empty");
		}
	}
}
