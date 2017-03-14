package validate;

import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.validator.AbstractValidator;

public class BaseValid extends AbstractValidator {

	@Override
	public void validate(ValidationContext ctx) {
		// TODO Auto-generated method stub
		
		boolean check = noEmpty(ctx) && minwith(ctx);
		System.out.println(check);
	}

	private boolean minwith(ValidationContext ctx) {
		boolean rs = true;
		String constraint = (String)ctx.getBindContext().getValidatorArg("constraint");
		// noempty|minwith
		if(constraint.contains("minwith")) {
			Object value = ctx.getProperty().getValue();
			Integer max = Integer.valueOf(ctx.getBindContext().getValidatorArg("max")+"");
			System.out.println(value);
			System.out.println("max is: " + max);
			if(value != null && !value.toString().isEmpty() && Integer.valueOf(value.toString()) <= max) {
				addInvalidMessage(ctx, "Must be greater than "+max);
				rs = false;
			}	
		}
		return rs;
	}
	
	private boolean noEmpty(ValidationContext ctx) {
		boolean rs = true;
		String constraint = (String)ctx.getBindContext().getValidatorArg("constraint");
		// noempty|minwith
		if(constraint.contains("noempty")) {
			Object value = ctx.getProperty().getValue();
			if(value == null || value.toString().isEmpty()) {
				addInvalidMessage(ctx, "No empty");
				rs = false;
			}	
		}
		return rs;
	}
	
}
