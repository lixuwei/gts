package com.wf.gts.remoting.header;
import com.wf.gts.remoting.CommandCustomHeader;
import com.wf.gts.remoting.annotation.CFNotNull;
import com.wf.gts.remoting.exception.RemotingCommandException;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UnRegisterBrokerRequestHeader implements CommandCustomHeader {
    @CFNotNull
    private String brokerName;
    @CFNotNull
    private String brokerAddr;

    @CFNotNull
    private Long brokerId;

    @Override
    public void checkFields() throws RemotingCommandException {
    }

   
}
