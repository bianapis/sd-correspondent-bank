package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ArrangementBaseWithIds
 */
public class ArrangementBaseWithIds   {
  private String correspondentBankArrangementReference = null;

  private String correspondentBankArrangement = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondentBankArrangement
  **/

  public String getCorrespondentBankArrangement() {
    return correspondentBankArrangement;
  }

  public void setCorrespondentBankArrangement(String correspondentBankArrangement) {
    this.correspondentBankArrangement = correspondentBankArrangement;
  }


}

