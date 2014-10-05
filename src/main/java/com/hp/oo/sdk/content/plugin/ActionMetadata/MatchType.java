/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package com.hp.oo.sdk.content.plugin.ActionMetadata;

/**
 * User: hanael
 */

/**
 * This enum is used in Studio the create operations from the @Action/IActions
 * Do not modify this file unless we modify also IResultExpression in studio
 */
//TODO: Fix Javadoc - reference to OO Studio
public enum MatchType {
    CONTAINS,
    EXACT,
    NOT_EXACT,
    ALL_WORDS,
    AT_LEAST_ONE,
    NONE,
    ONE,
    BEGINS_WITH,
    ENDS_WITH,
    ALWAYS_MATCH,
    COMPARE_EQUAL,
    COMPARE_NOT_EQUAL,
    COMPARE_GREATER,
    COMPARE_GREATER_OR_EQUAL,
    COMPARE_LESS,
    COMPARE_LESS_OR_EQUAL;
}
