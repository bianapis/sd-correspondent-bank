/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorrespondentBankApiService {

	InboundBaseWithId executePostInbounds(String crReferenceId, InboundBase request);
	
	InboundBaseWithId executePutInbounds(String crReferenceId, String bqReferenceId, InboundBase request);
	
	OutboundBaseWithId executePostOutbounds(String crReferenceId, OutboundBase request);
	
	OutboundBaseWithId executePutOutbounds(String crReferenceId, String bqReferenceId, OutboundBase request);
	
	ArrangementBaseWithIds initiate(ArrangementBase request);
	
	CorrespondentBankRecordResponse record(String crReferenceId, CorrespondentBankRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	ArrangementBaseWithIds retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	InboundBaseWithId retrieveInbounds(String crReferenceId, String bqReferenceId);
	
	OutboundBaseWithId retrieveOutbounds(String crReferenceId, String bqReferenceId);
	
	ReconciliationsBaseWithId retrieveReconciliations(String crReferenceId, String bqReferenceId);
	
	ReportingBaseWithId retrieveReportings(String crReferenceId, String bqReferenceId);
	
	UpdateBaseWIthId retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	ClearingAndSettlementBaseWithId retrieveClearingAndSettlement(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	UpdateBaseWIthId update(String crReferenceId, UpdateBase request);
	
}
