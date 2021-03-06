/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupPlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     * <code>TRUE</code>.
     * </p>
     */
    private Boolean includeDeleted;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlansRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @return The maximum number of items to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     * <code>TRUE</code>.
     * </p>
     * 
     * @param includeDeleted
     *        A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     *        <code>TRUE</code>.
     */

    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    /**
     * <p>
     * A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     * <code>TRUE</code>.
     * </p>
     * 
     * @return A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     *         <code>TRUE</code>.
     */

    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
    }

    /**
     * <p>
     * A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     * <code>TRUE</code>.
     * </p>
     * 
     * @param includeDeleted
     *        A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     *        <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlansRequest withIncludeDeleted(Boolean includeDeleted) {
        setIncludeDeleted(includeDeleted);
        return this;
    }

    /**
     * <p>
     * A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     * <code>TRUE</code>.
     * </p>
     * 
     * @return A Boolean value with a default value of <code>FALSE</code> that returns deleted backup plans when set to
     *         <code>TRUE</code>.
     */

    public Boolean isIncludeDeleted() {
        return this.includeDeleted;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getIncludeDeleted() != null)
            sb.append("IncludeDeleted: ").append(getIncludeDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupPlansRequest == false)
            return false;
        ListBackupPlansRequest other = (ListBackupPlansRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getIncludeDeleted() == null ^ this.getIncludeDeleted() == null)
            return false;
        if (other.getIncludeDeleted() != null && other.getIncludeDeleted().equals(this.getIncludeDeleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getIncludeDeleted() == null) ? 0 : getIncludeDeleted().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupPlansRequest clone() {
        return (ListBackupPlansRequest) super.clone();
    }

}
