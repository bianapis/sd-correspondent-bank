/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CorrespondentBankApiController {

	@Autowired
	CorrespondentBankApiService service;
	
	@BQ("inbounds")
	@Fulfill.ExecutePost
	public BianResponse<InboundBaseWithId> executePostInbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<InboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostInbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Fulfill.ExecutePut
	public BianResponse<InboundBaseWithId> executePutInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<InboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutInbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Fulfill.ExecutePost
	public BianResponse<OutboundBaseWithId> executePostOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OutboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Fulfill.ExecutePut
	public BianResponse<OutboundBaseWithId> executePutOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<OutboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<ArrangementBaseWithIds> initiate(@RequestBody BianRequest<ArrangementBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<CorrespondentBankRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondentBankRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.Retrieve
	public BianResponse<ArrangementBaseWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("inbounds")
	@Fulfill.Retrieve
	public BianResponse<InboundBaseWithId> retrieveInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbounds")
	@Fulfill.Retrieve
	public BianResponse<OutboundBaseWithId> retrieveOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("reconciliations")
	@Fulfill.Retrieve
	public BianResponse<ReconciliationsBaseWithId> retrieveReconciliations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReconciliations(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Fulfill.Retrieve
	public BianResponse<ReportingBaseWithId> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Fulfill.Retrieve
	public BianResponse<UpdateBaseWIthId> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@BQ("clearing-and-settlement")
	@Fulfill.Retrieve
	public BianResponse<ClearingAndSettlementBaseWithId> retrieveClearingAndSettlement(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveClearingAndSettlement(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<UpdateBaseWIthId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<UpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
