package org.jooq.scala.test

import collection.JavaConversions._
import org.scalatest.FunSuite
import org.jooq._
import org.jooq.impl._
import org.jooq.scala.example.h2.Tables._
import org.jooq.scala.Conversions._
import org.jooq.conf.Settings
import javax.xml.bind.JAXB
import org.jooq.conf.SettingsTools
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ComparisonPredicateTest extends FunSuite {

  test("comparison predicate") {
    val eq1 = T_BOOK.ID === T_BOOK.AUTHOR_ID
    val eq2 = T_BOOK.ID === 1
    val ne1 = T_BOOK.ID !== T_BOOK.AUTHOR_ID
    val ne2 = T_BOOK.ID !== 1
    val ne3 = T_BOOK.ID <> T_BOOK.AUTHOR_ID
    val ne4 = T_BOOK.ID <> 1
    val gt1 = T_BOOK.ID > T_BOOK.AUTHOR_ID
    val gt2 = T_BOOK.ID > 1
    val ge1 = T_BOOK.ID >= T_BOOK.AUTHOR_ID
    val ge2 = T_BOOK.ID >= 1
    val lt1 = T_BOOK.ID < T_BOOK.AUTHOR_ID
    val lt2 = T_BOOK.ID < 1
    val le1 = T_BOOK.ID <= T_BOOK.AUTHOR_ID
    val le2 = T_BOOK.ID <= 1

    assert(""""PUBLIC"."T_BOOK"."ID" = "PUBLIC"."T_BOOK"."AUTHOR_ID""""  == eq1.toString(), eq1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" = 1"""                              == eq2.toString(), eq2.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" <> "PUBLIC"."T_BOOK"."AUTHOR_ID"""" == ne1.toString(), ne1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" <> 1"""                             == ne2.toString(), ne2.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" <> "PUBLIC"."T_BOOK"."AUTHOR_ID"""" == ne3.toString(), ne3.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" <> 1"""                             == ne4.toString(), ne4.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" > "PUBLIC"."T_BOOK"."AUTHOR_ID""""  == gt1.toString(), gt1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" > 1"""                              == gt2.toString(), gt2.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" >= "PUBLIC"."T_BOOK"."AUTHOR_ID"""" == ge1.toString(), ge1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" >= 1"""                             == ge2.toString(), ge2.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" < "PUBLIC"."T_BOOK"."AUTHOR_ID""""  == lt1.toString(), lt1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" < 1"""                              == lt2.toString(), lt2.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" <= "PUBLIC"."T_BOOK"."AUTHOR_ID"""" == le1.toString(), le1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" <= 1"""                             == le2.toString(), le2.toString())
  }

  test("distinct predicate") {
    val d1 = T_BOOK.ID <=> T_BOOK.AUTHOR_ID
    val d2 = T_BOOK.ID <=> 1

    assert(""""PUBLIC"."T_BOOK"."ID" is not distinct from "PUBLIC"."T_BOOK"."AUTHOR_ID"""" == d1.toString(), d1.toString())
    assert(""""PUBLIC"."T_BOOK"."ID" is not distinct from 1"""                             == d2.toString(), d2.toString())
  }
}