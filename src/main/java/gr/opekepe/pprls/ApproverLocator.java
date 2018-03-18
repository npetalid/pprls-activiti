package gr.opekepe.pprls;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ApproverLocator implements JavaDelegate {

	org.activiti.engine.impl.el.FixedValue requester;
	
	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		String arequester = (String)requester.getExpressionText();
		
		String response = "";
		if (!arequester.equals("Nikos")) {			
			response = arequester+"Approver";
		}
		
		arg0.setVariable("response",response);
		
	}
}
