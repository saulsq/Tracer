package com.test.plugin.trace.internal

import com.test.plugin.trace.util.StringMatcher
import org.junit.Assert.*
import org.junit.Test

/**
 * [com.test.plugin.trace.Matcher]的测试类
 *
 * @author saulshi
 * @version 2022/10/17
 */
class MatcherTest {

    @Test
    fun test_matcher_hit() {
        val patterns = setOf("com.test.*")
        val matcher = StringMatcher(patterns)

        val result = matcher.match("com.test.MainActivity1")
        assert(result)
    }

    @Test
    fun test_matcher_miss() {
        val patterns = setOf("com.test.*")
        val matcher = StringMatcher(patterns)

        val result = matcher.match("com.tes")
        assert(!result)
    }

}