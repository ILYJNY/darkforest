package io.github.ILYJNY.darkforest.plugin.enchance
import kotlin.random.Random




class Enchance {

    fun Random(Success : Float, Fail : Float, Down : Float, Destroy : Float) : Int {
        val randomValue = Random.nextFloat()
        val success = Success / 100
        val fail = Fail / 100
        val down = Down / 100
        val destroy = Destroy / 100
        if (randomValue <= success) return 0
        else if (randomValue - success <= fail) return 1
        else if (randomValue - success - fail <= down) return 2
        else return 3
    }

    fun Enchance_do(NowLevel : Int) : Int {//리턴값 0 성공, 1 실패, 2 강하, 3 파괴
        if (NowLevel == 1) {
            //확률 100
            return 0
        }
        else if (NowLevel == 2) {
            //확률 90
            return Random(90F, 10F, 0F, 0F)

        }
        else if (NowLevel == 3) {
            //확률 80, 강하 1
            return Random(80F, 19F, 1F, 0F)
        }
        else if (NowLevel == 4) {
            //확률 80, 강하 1
            return Random(80F, 19F, 1F, 0F)
        }
        else if (NowLevel == 5) {
            //확률 70, 강하 5
            return Random(70F, 25F, 5F, 0F)
        }
        else if (NowLevel == 6) {
            //확률 50, 강하 10, 파괴 0
            return Random(50F, 40F, 10F, 0F)
        }
        else if (NowLevel == 7) {
            //확률 30, 강하 30, 파괴 10
            return Random(30F, 30F, 30F, 10F)
        }
        else if (NowLevel == 8) {
            //확률 30, 강하 40, 파괴 10
            return Random(30F, 20F, 40F, 10F)

        }
        else if (NowLevel == 9) {
            //확률 5, 강하 50, 파괴 20
            return Random(5F, 25F, 50F, 20F)
        }
        else {
            //확률 100
            return 0

        }
    }
}