package com.x.organization.assemble.authentication.jaxrs.oauth;

import com.x.base.core.project.exception.PromptException;

class ExceptionAccessTokenEmpty extends PromptException {

	private static final long serialVersionUID = 4132300948670472899L;

	ExceptionAccessTokenEmpty() {
		super("access_token can not be empty.");
	}
}
