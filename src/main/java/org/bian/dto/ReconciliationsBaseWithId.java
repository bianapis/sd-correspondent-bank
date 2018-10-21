package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReconciliationsBaseWithId
 */
public class ReconciliationsBaseWithId   {
  private String correspondentBankArrangementReference = null;

  private String correspondentBankReconciliationTaskReference = null;

  private String correspondentBankAccessServiceSessionReference = null;

  private String swiftTransactionReference = null;

  private String correspondentBankAgreementReference = null;

  private String correspondentBankAgreement = null;

  private String correspondentBankVostroAccountReference = null;

  private String correspondentBankMirrorNostroAccountReference = null;

  private String correspondentTransactionReference = null;

  private String correspondentBankTransactionReconciliationTaskReference = null;

  private String correspondentBankReconciliationTaskResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankArrangementReference
  **/

  public String getCorrespondentBankArrangementReference() {
    return correspondentBankArrangementReference;
  }

  public void setCorrespondentBankArrangementReference(String correspondentBankArrangementReference) {
    this.correspondentBankArrangementReference = correspondentBankArrangementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankReconciliationTaskReference
  **/

  public String getCorrespondentBankReconciliationTaskReference() {
    return correspondentBankReconciliationTaskReference;
  }

  public void setCorrespondentBankReconciliationTaskReference(String correspondentBankReconciliationTaskReference) {
    this.correspondentBankReconciliationTaskReference = correspondentBankReconciliationTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankAccessServiceSessionReference
  **/

  public String getCorrespondentBankAccessServiceSessionReference() {
    return correspondentBankAccessServiceSessionReference;
  }

  public void setCorrespondentBankAccessServiceSessionReference(String correspondentBankAccessServiceSessionReference) {
    this.correspondentBankAccessServiceSessionReference = correspondentBankAccessServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return swiftTransactionReference
  **/

  public String getSwiftTransactionReference() {
    return swiftTransactionReference;
  }

  public void setSwiftTransactionReference(String swiftTransactionReference) {
    this.swiftTransactionReference = swiftTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankAgreementReference
  **/

  public String getCorrespondentBankAgreementReference() {
    return correspondentBankAgreementReference;
  }

  public void setCorrespondentBankAgreementReference(String correspondentBankAgreementReference) {
    this.correspondentBankAgreementReference = correspondentBankAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondentBankAgreement
  **/

  public String getCorrespondentBankAgreement() {
    return correspondentBankAgreement;
  }

  public void setCorrespondentBankAgreement(String correspondentBankAgreement) {
    this.correspondentBankAgreement = correspondentBankAgreement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankVostroAccountReference
  **/

  public String getCorrespondentBankVostroAccountReference() {
    return correspondentBankVostroAccountReference;
  }

  public void setCorrespondentBankVostroAccountReference(String correspondentBankVostroAccountReference) {
    this.correspondentBankVostroAccountReference = correspondentBankVostroAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankMirrorNostroAccountReference
  **/

  public String getCorrespondentBankMirrorNostroAccountReference() {
    return correspondentBankMirrorNostroAccountReference;
  }

  public void setCorrespondentBankMirrorNostroAccountReference(String correspondentBankMirrorNostroAccountReference) {
    this.correspondentBankMirrorNostroAccountReference = correspondentBankMirrorNostroAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentTransactionReference
  **/

  public String getCorrespondentTransactionReference() {
    return correspondentTransactionReference;
  }

  public void setCorrespondentTransactionReference(String correspondentTransactionReference) {
    this.correspondentTransactionReference = correspondentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondentBankTransactionReconciliationTaskReference
  **/

  public String getCorrespondentBankTransactionReconciliationTaskReference() {
    return correspondentBankTransactionReconciliationTaskReference;
  }

  public void setCorrespondentBankTransactionReconciliationTaskReference(String correspondentBankTransactionReconciliationTaskReference) {
    this.correspondentBankTransactionReconciliationTaskReference = correspondentBankTransactionReconciliationTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondentBankReconciliationTaskResult
  **/

  public String getCorrespondentBankReconciliationTaskResult() {
    return correspondentBankReconciliationTaskResult;
  }

  public void setCorrespondentBankReconciliationTaskResult(String correspondentBankReconciliationTaskResult) {
    this.correspondentBankReconciliationTaskResult = correspondentBankReconciliationTaskResult;
  }


}

