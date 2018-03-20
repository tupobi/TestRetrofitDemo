package com.example.testretrofit2;

import java.util.List;

/**
 * Created by Administrator on 2018/3/18/018.
 */

public class Translation {

    /**
     * status : 0
     * msg : ok
     * result : {"name":"叶公好龙","pronounce":"yè gōng hào lóng","content":"叶公：春秋时楚国贵族，名子高，封于叶（古邑名，今河南叶县）。比喻口头上说爱好某事物，实际上并不真爱好。","comefrom":"汉·刘向《新序·杂事》记载：叶公子高非常喜欢龙，器物上刻着龙，房屋上也画着龙。真龙知道了，来到叶公家里，把头探进窗子。叶公一见，吓得拔腿就跑。","antonym":["言不由衷","两面三刀","表里不一","口是心非"],"thesaurus":["名副其实","名实相符","表里如一"],"example":""}
     */

    private String status;
    private String msg;
    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * name : 叶公好龙
         * pronounce : yè gōng hào lóng
         * content : 叶公：春秋时楚国贵族，名子高，封于叶（古邑名，今河南叶县）。比喻口头上说爱好某事物，实际上并不真爱好。
         * comefrom : 汉·刘向《新序·杂事》记载：叶公子高非常喜欢龙，器物上刻着龙，房屋上也画着龙。真龙知道了，来到叶公家里，把头探进窗子。叶公一见，吓得拔腿就跑。
         * antonym : ["言不由衷","两面三刀","表里不一","口是心非"]
         * thesaurus : ["名副其实","名实相符","表里如一"]
         * example :
         */

        private String name;
        private String pronounce;
        private String content;
        private String comefrom;
        private String example;
        private List<String> antonym;
        private List<String> thesaurus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPronounce() {
            return pronounce;
        }

        public void setPronounce(String pronounce) {
            this.pronounce = pronounce;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getComefrom() {
            return comefrom;
        }

        public void setComefrom(String comefrom) {
            this.comefrom = comefrom;
        }

        public String getExample() {
            return example;
        }

        public void setExample(String example) {
            this.example = example;
        }

        public List<String> getAntonym() {
            return antonym;
        }

        public void setAntonym(List<String> antonym) {
            this.antonym = antonym;
        }

        public List<String> getThesaurus() {
            return thesaurus;
        }

        public void setThesaurus(List<String> thesaurus) {
            this.thesaurus = thesaurus;
        }
    }
}
