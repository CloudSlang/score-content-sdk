/*******************************************************************************
* (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License v2.0 which accompany this distribution.
*
* The Apache License is available at
* http://www.apache.org/licenses/LICENSE-2.0
*
*******************************************************************************/

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
