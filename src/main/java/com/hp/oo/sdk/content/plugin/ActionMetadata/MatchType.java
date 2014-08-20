package com.hp.oo.sdk.content.plugin.ActionMetadata;

/**
 * User: hanael
 */

/**
 * This enum is used in Studio the create operations from the @Action/IActions
 * Do not modify this file unless we modify also IResultExpression in studio
 */
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
