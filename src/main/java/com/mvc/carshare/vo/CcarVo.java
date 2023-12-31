package com.mvc.carshare.vo;
//이동해
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CcarVo {
	private int car_id;					//자동차ID
	private String car_number;		//자동차번호
	private int owner_id;			//소유주
	private int review_id;			//후기번호
	private String car_image;		//차량 이미지
	private String car_model;		//자동차 모델
	private String manufacturer;	//제조사
	private String engine_type;		//엔진종류
	private String car_type;		//자동차 타입
	private String c_year;			//연식
}
