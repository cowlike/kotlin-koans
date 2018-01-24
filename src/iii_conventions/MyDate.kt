package iii_conventions

//data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return ((year - other.year) * 100
                + (month - other.month) * 10
                + dayOfMonth - other.dayOfMonth)
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = this..other

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

//class DateRange(val start: MyDate, val endInclusive: MyDate)

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains (value: MyDate): Boolean {
        return value >= start && value <= endInclusive
    }
}
