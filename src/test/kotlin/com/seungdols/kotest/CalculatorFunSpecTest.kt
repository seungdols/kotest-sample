package com.seungdols.kotest

import io.kotest.core.spec.style.*
import io.kotest.matchers.shouldBe

class CalculatorAnnotationSpecTest: AnnotationSpec() {
    @Test
    fun `10 + 20 더하면, 30이 반환 되어야 한다`() {
        val calculator = Calculator()
        val result = calculator.add(10, 20)
        result shouldBe 30
    }
}

class CalculatorFunSpecTest : FunSpec({
    test("10 + 20 더하면, 30이 반환 되어야 한다.") {
        val calculator = Calculator()
        val result = calculator.add(10, 20)
        result shouldBe 30
    }
})

class CalculatorStringSpecTest : StringSpec({
    "10 + 20 더하면, 30이 반환 되어야 한다." {
        val calculator = Calculator()
        val result = calculator.add(10, 20)
        result shouldBe 30
    }
})

class CalculatorShouldSpecTest : ShouldSpec({
    should("10 + 20 더하면, 30이 반환") {
        val calculator = Calculator()
        val result = calculator.add(10, 20)
        result shouldBe 30
    }
})

class CalculatorDescribeSpecTest : DescribeSpec({
    describe("calculator 테스트") {
        it("10 + 20 더하면, 30이 반환 되어야 한다.") {
            val calculator = Calculator()
            val result = calculator.add(10, 20)
            result shouldBe 30
        }

        it("10 + 30 더하면, 40이 반환 되어야 한다.") {
            val calculator = Calculator()
            val result = calculator.add(10, 30)
            result shouldBe 40
        }
    }
})

class CalculatorBehaviorSpecTest : BehaviorSpec({
    given("calculator 테스트") {
        `when`("10 + 20 더하면,") {
            then("30이 반환 되어야 한다.") {
                val calculator = Calculator()
                val result = calculator.add(10, 20)
                result shouldBe 30
            }
        }

        `when`("10 + 30 더하면,") {
            then("40이 반환 되어야 한다.") {
                val calculator = Calculator()
                val result = calculator.add(10, 30)
                result shouldBe 40
            }
            xthen("해당 구문은 실행하지 않는다.") {
                val calculator = Calculator()
                val result = calculator.add(10, 30)
                result shouldBe 40
            }
        }
    }
})