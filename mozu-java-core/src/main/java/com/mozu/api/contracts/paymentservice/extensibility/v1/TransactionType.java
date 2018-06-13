package com.mozu.api.contracts.paymentservice.extensibility.v1;

public enum TransactionType {
	Sale,
	Authorize,
	Capture,
	Force,
	Credit,
	Void,
	AuthorizeAndCapture,
	Information,
	Init3dSecure,
	Finalize3dSecure,
	FraudScreen,
	Debit;
}
