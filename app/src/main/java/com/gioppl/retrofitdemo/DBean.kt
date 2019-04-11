package com.gioppl.retrofitdemo

/**
 * create time：2019/4/11 11:36
 * creater：17664
 * desc:
 */
class DBean {
    /**
     * count : 1
     * start : 25
     * total : 250
     * subjects : [{"rating":{"max":10,"average":9.2,"stars":"50","min":0},"genres":["剧情","历史","爱情"],"title":"乱世佳人","casts":[{"alt":"https://movie.douban.com/celebrity/1010506/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp"},"name":"费雯·丽","id":"1010506"},{"alt":"https://movie.douban.com/celebrity/1006997/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp"},"name":"克拉克·盖博","id":"1006997"},{"alt":"https://movie.douban.com/celebrity/1010604/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp"},"name":"奥利维娅·德哈维兰","id":"1010604"}],"collect_count":504029,"original_title":"Gone with the Wind","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1032275/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp"},"name":"维克多·弗莱明","id":"1032275"},{"alt":"https://movie.douban.com/celebrity/1010711/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp"},"name":"乔治·库克","id":"1010711"},{"alt":"https://movie.douban.com/celebrity/1012588/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp"},"name":"山姆·伍德","id":"1012588"}],"year":"1939","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp"},"alt":"https://movie.douban.com/subject/1300267/","id":"1300267"}]
     * title : 豆瓣电影Top250
     */

    var count: Int = 0
    var start: Int = 0
    var total: Int = 0
    var title: String? = null
    var subjects: List<SubjectsBean>? = null

    class SubjectsBean {
        /**
         * rating : {"max":10,"average":9.2,"stars":"50","min":0}
         * genres : ["剧情","历史","爱情"]
         * title : 乱世佳人
         * casts : [{"alt":"https://movie.douban.com/celebrity/1010506/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp"},"name":"费雯·丽","id":"1010506"},{"alt":"https://movie.douban.com/celebrity/1006997/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp"},"name":"克拉克·盖博","id":"1006997"},{"alt":"https://movie.douban.com/celebrity/1010604/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp"},"name":"奥利维娅·德哈维兰","id":"1010604"}]
         * collect_count : 504029
         * original_title : Gone with the Wind
         * subtype : movie
         * directors : [{"alt":"https://movie.douban.com/celebrity/1032275/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp"},"name":"维克多·弗莱明","id":"1032275"},{"alt":"https://movie.douban.com/celebrity/1010711/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp"},"name":"乔治·库克","id":"1010711"},{"alt":"https://movie.douban.com/celebrity/1012588/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp"},"name":"山姆·伍德","id":"1012588"}]
         * year : 1939
         * images : {"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp"}
         * alt : https://movie.douban.com/subject/1300267/
         * id : 1300267
         */

        var rating: RatingBean? = null
        var title: String? = null
        var collect_count: Int = 0
        var original_title: String? = null
        var subtype: String? = null
        var year: String? = null
        var images: ImagesBean? = null
        var alt: String? = null
        var id: String? = null
        var genres: List<String>? = null
        var casts: List<CastsBean>? = null
        var directors: List<DirectorsBean>? = null

        class RatingBean {
            /**
             * max : 10
             * average : 9.2
             * stars : 50
             * min : 0
             */

            var max: Int = 0
            var average: Double = 0.toDouble()
            var stars: String? = null
            var min: Int = 0
        }

        class ImagesBean {
            /**
             * small : http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp
             * large : http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp
             * medium : http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp
             */

            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }

        class CastsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1010506/
             * avatars : {"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp"}
             * name : 费雯·丽
             * id : 1010506
             */

            var alt: String? = null
            var avatars: AvatarsBean? = null
            var name: String? = null
            var id: String? = null

            class AvatarsBean {
                /**
                 * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp
                 * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp
                 * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp
                 */

                var small: String? = null
                var large: String? = null
                var medium: String? = null
            }
        }

        class DirectorsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1032275/
             * avatars : {"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp"}
             * name : 维克多·弗莱明
             * id : 1032275
             */

            var alt: String? = null
            var avatars: AvatarsBeanX? = null
            var name: String? = null
            var id: String? = null

            class AvatarsBeanX {
                /**
                 * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp
                 * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp
                 * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp
                 */

                var small: String? = null
                var large: String? = null
                var medium: String? = null
            }
        }
    }
}
