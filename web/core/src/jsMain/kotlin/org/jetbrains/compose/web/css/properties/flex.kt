/*
 * Copyright 2020-2021 JetBrains s.r.o. and respective authors and developers.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

package org.jetbrains.compose.web.css

import org.w3c.dom.css.CSS

fun StyleBuilder.flexDirection(flexDirection: FlexDirection) {
    property("flex-direction", flexDirection)
}

fun StyleBuilder.flexWrap(flexWrap: FlexWrap) {
    property("flex-wrap", flexWrap)
}

fun StyleBuilder.flexFlow(flexDirection: FlexDirection, flexWrap: FlexWrap) {
    property(
        "flex-flow",
        "${flexDirection} ${flexWrap}"
    )
}

fun StyleBuilder.justifyContent(justifyContent: BasicStringProperty) {
    property("justify-content", justifyContent)
}

fun StyleBuilder.justifyContent(justifyContent: SpacedContent) {
    property("justify-content", justifyContent)
}

fun StyleBuilder.justifyContent(justifyContent: JustifyContent) {
    property("justify-content", justifyContent)
}

fun StyleBuilder.alignSelf(alignSelf: BasicStringProperty) {
    property("align-self", alignSelf)
}

fun StyleBuilder.alignSelf(alignSelf: AlignSelf) {
    property("align-self", alignSelf)
}

fun StyleBuilder.alignItems(alignItems: BasicStringProperty) {
    property("align-items", alignItems)
}

fun StyleBuilder.alignItems(alignItems: AlignItems) {
    property("align-items", alignItems)
}

fun StyleBuilder.alignContent(alignContent: BasicStringProperty) {
    property("align-content", alignContent)
}

fun StyleBuilder.alignContent(alignContent: SpacedContent) {
    property("align-content", alignContent)
}

fun StyleBuilder.alignContent(alignContent: AlignContent) {
    property("align-content", alignContent)
}

fun StyleBuilder.order(value: Int) {
    property("order", value)
}

fun StyleBuilder.flexGrow(value: Number) {
    property("flex-grow", value)
}

fun StyleBuilder.flexShrink(value: Number) {
    property("flex-shrink", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/flex-basis
fun StyleBuilder.flexBasis(value: String) {
    property("flex-basis", value)
}

fun StyleBuilder.flexBasis(value: CSSNumeric) {
    property("flex-basis", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/flex
fun StyleBuilder.flex(value: String) {
    property("flex", value)
}

fun StyleBuilder.flex(value: Int) {
    property("flex", value)
}

fun StyleBuilder.flex(value: CSSNumeric) {
    property("flex", value)
}

fun StyleBuilder.flex(flexGrow: Int, flexBasis: CSSNumeric) {
    property("flex", "${flexGrow} ${flexBasis}")
}

fun StyleBuilder.flex(flexGrow: Int, flexShrink: Int) {
    property("flex", "${flexGrow} ${flexShrink}")
}

fun StyleBuilder.flex(flexGrow: Int, flexShrink: Int, flexBasis: CSSNumeric) {
    property("flex", "${flexGrow} ${flexShrink} ${flexBasis}")
}

