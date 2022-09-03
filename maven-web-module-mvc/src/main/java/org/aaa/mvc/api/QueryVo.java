package org.aaa.mvc.api;

import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:03 2022/09/03 18:39
 * @description: Exercise
 * @Version 1.0.0
 */
public class QueryVo {
        private String keyword;
        private User user;
        private List<User> userList;
        private Map<String, User> userMap;

        public QueryVo() {
        }

        public QueryVo(String keyword, User user, List<User> userList, Map<String, User> userMap) {
                this.keyword = keyword;
                this.user = user;
                this.userList = userList;
                this.userMap = userMap;
        }

        @Override
        public String toString() {
                return "QueryVo{" +
                        "keyword='" + keyword + '\'' +
                        ", user=" + user +
                        ", userList=" + userList +
                        ", userMap=" + userMap +
                        '}';
        }

        public String getKeyword() {
                return keyword;
        }

        public void setKeyword(String keyword) {
                this.keyword = keyword;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public List<User> getUserList() {
                return userList;
        }

        public void setUserList(List<User> userList) {
                this.userList = userList;
        }

        public Map<String, User> getUserMap() {
                return userMap;
        }

        public void setUserMap(Map<String, User> userMap) {
                this.userMap = userMap;
        }
}
