package com.cos.photogramstart.web.dto.comment;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;

// notnull = null값 체크
// notempty == 빈값이나 null값 체크
// notblak 빈값이나 null 체크 그리고 빈공백
@Data
public class CommentDto {
	@NotBlank
	private String content;
	@NotNull
	private Integer imageId;
	
	//to Entity가 필요 없다.
}
