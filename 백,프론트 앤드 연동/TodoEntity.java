package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Todo테이블에 있는 내용을 담기위한 클래스

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder 
//자바 클래스를 entity로 지정하기 위해 사용
//이름을 부여하고 싶다면 @Entity("TodoEntity")처럼 매개변수를 넣울 수 있다.
@Entity
//테이블이름을 지정해기위해 @talble 어노테이션을 사용
//이 엔티티는 데이터베이스의 Todo테이블에 매핑된다는 뜻이다.
//만약 @Table을 추가하지 않거나 추가해도 name을 명시하지 않는다면
//@Entity의 이름을 테이블로 간주한다.
//만약 @Entity의 이름을 지정하지 않는 경우 클래스의 이름을 테이블 이름으로 간주한다.
@Table(name="Todo")
public class TodoEntity {
	@Id //기본키가 될 필드에 지정한다.
	
	//ID를 자동으로 생성하겟다.
	//generator : 어떻게 ID를 생성할지 정하는 변수
	//@GenericGenerator : 나만의 제너레이터를 사용하고 싶을때 이용하는 어노테이션
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String id;//이 객체의 id
	private String userId;//이 객체를 생성한 유저의 아이디
	private String title;//Todo타이틀 ex)운동하기
	private boolean done; //true-todo를 완료한경우(checked)



















}
