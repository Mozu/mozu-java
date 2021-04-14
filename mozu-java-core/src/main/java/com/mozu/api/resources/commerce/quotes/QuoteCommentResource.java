/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.quotes;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class QuoteCommentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public QuoteCommentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	QuoteComment quotecomment = new QuoteComment();
	 *	QuoteComment quoteComment = quotecomment.get( quoteId,  commentId);
	 * </code></pre></p>
	 * @param commentId 
	 * @param quoteId 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteComment get(String quoteId, String commentId) throws Exception
	{
		return get( quoteId,  commentId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	QuoteComment quotecomment = new QuoteComment();
	 *	QuoteComment quoteComment = quotecomment.get( quoteId,  commentId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param commentId 
	 * @param draft 
	 * @param quoteId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteComment get(String quoteId, String commentId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteComment> client = com.mozu.api.clients.commerce.quotes.QuoteCommentClient.getClient( quoteId,  commentId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	QuoteComment quotecomment = new QuoteComment();
	 *	QuoteComment quoteComment = quotecomment.getAll( quoteId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteComment getAll(String quoteId) throws Exception
	{
		return getAll( quoteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	QuoteComment quotecomment = new QuoteComment();
	 *	QuoteComment quoteComment = quotecomment.getAll( quoteId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteComment getAll(String quoteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteComment> client = com.mozu.api.clients.commerce.quotes.QuoteCommentClient.getAllClient( quoteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	QuoteComment quotecomment = new QuoteComment();
	 *	QuoteComment quoteComment = quotecomment.create( comment,  quoteId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param comment 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteComment create(com.mozu.api.contracts.commerceruntime.quotes.QuoteComment comment, String quoteId) throws Exception
	{
		return create( comment,  quoteId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	QuoteComment quotecomment = new QuoteComment();
	 *	QuoteComment quoteComment = quotecomment.create( comment,  quoteId,  updateMode,  responseFields);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param responseFields 
	 * @param updateMode 
	 * @param comment 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteComment
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteComment create(com.mozu.api.contracts.commerceruntime.quotes.QuoteComment comment, String quoteId, String updateMode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteComment> client = com.mozu.api.clients.commerce.quotes.QuoteCommentClient.createClient( comment,  quoteId,  updateMode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



