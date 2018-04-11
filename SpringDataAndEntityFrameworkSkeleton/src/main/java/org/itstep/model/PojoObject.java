package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "ent_pojo" )
public class PojoObject {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column( name = "pojo_id" )
	@JsonProperty 
	private Integer id;
	
	@Column( name = "text_field" )
	@JsonProperty
	private String textField;
	
	@Column( name = "pojo_condition" )
	@JsonProperty
	private Boolean condition;
}
