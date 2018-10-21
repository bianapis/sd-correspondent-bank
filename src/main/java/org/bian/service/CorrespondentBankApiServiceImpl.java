/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorrespondentBankApiServiceImpl implements CorrespondentBankApiService {

	public InboundBaseWithId executePostInbounds(String crReferenceId, InboundBase request){
		return JsonReader.read("executePost-InboundBaseWithId.json",new TypeReference<InboundBaseWithId>(){});
	}
	
	public InboundBaseWithId executePutInbounds(String crReferenceId, String bqReferenceId, InboundBase request){
		return JsonReader.read("executePut-InboundBaseWithId.json",new TypeReference<InboundBaseWithId>(){});
	}
	
	public OutboundBaseWithId executePostOutbounds(String crReferenceId, OutboundBase request){
		return JsonReader.read("executePost-OutboundBaseWithId.json",new TypeReference<OutboundBaseWithId>(){});
	}
	
	public OutboundBaseWithId executePutOutbounds(String crReferenceId, String bqReferenceId, OutboundBase request){
		return JsonReader.read("executePut-OutboundBaseWithId.json",new TypeReference<OutboundBaseWithId>(){});
	}
	
	public ArrangementBaseWithIds initiate(ArrangementBase request){
		return JsonReader.read("initiate-ArrangementBaseWithIds.json",new TypeReference<ArrangementBaseWithIds>(){});
	}
	
	public CorrespondentBankRecordResponse record(String crReferenceId, CorrespondentBankRecordRequest request){
		return JsonReader.read("record-CorrespondentBankRecordResponse.json",new TypeReference<CorrespondentBankRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ArrangementBaseWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ArrangementBaseWithIds.json",new TypeReference<ArrangementBaseWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public InboundBaseWithId retrieveInbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-InboundBaseWithId.json",new TypeReference<InboundBaseWithId>(){});
	}
	
	public OutboundBaseWithId retrieveOutbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OutboundBaseWithId.json",new TypeReference<OutboundBaseWithId>(){});
	}
	
	public ReconciliationsBaseWithId retrieveReconciliations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReconciliationsBaseWithId.json",new TypeReference<ReconciliationsBaseWithId>(){});
	}
	
	public ReportingBaseWithId retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingBaseWithId.json",new TypeReference<ReportingBaseWithId>(){});
	}
	
	public UpdateBaseWIthId retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-UpdateBaseWIthId.json",new TypeReference<UpdateBaseWIthId>(){});
	}
	
	public ClearingAndSettlementBaseWithId retrieveClearingAndSettlement(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ClearingAndSettlementBaseWithId.json",new TypeReference<ClearingAndSettlementBaseWithId>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public UpdateBaseWIthId update(String crReferenceId, UpdateBase request){
		return JsonReader.read("update-UpdateBaseWIthId.json",new TypeReference<UpdateBaseWIthId>(){});
	}
	
}
