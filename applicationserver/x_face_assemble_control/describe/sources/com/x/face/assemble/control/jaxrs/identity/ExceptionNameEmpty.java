package com.x.face.assemble.control.jaxrs.identity;

import com.x.base.core.project.exception.PromptException;

class ExceptionNameEmpty extends PromptException {

	private static final long serialVersionUID = -3439770681867963457L;

	ExceptionNameEmpty() {
		super("身份名称不能为空.");
	}
}
