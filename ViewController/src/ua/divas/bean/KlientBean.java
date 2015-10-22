package ua.divas.bean;

import java.util.Map;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.share.ADFContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class KlientBean {
    public KlientBean() {
    }

    public void onExecute(ActionEvent actionEvent) {
        BindingContainer binding = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding ob = binding.getOperationBinding("createKontr");
        if (ob != null) {
            //ob.getParamsMap().put("p_name", getKonName().getValue().toString());
            ob.getParamsMap().put("isSupp", 0);
            ob.getParamsMap().put("isMeasr", 0);
            ob.getParamsMap().put("isByer", 0);
            String uuid = (String) ob.execute();
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            pageFlowScope.put("KontragId", uuid);
        }
    }
}
