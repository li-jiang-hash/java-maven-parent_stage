package org.aaa.api;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 19:34
 * @description: Exercise
 * @Version 1.0.0
 */
public class Role {
        private Integer id;
        private String roleName;
        private String roleDesc;

        @Override
        public String toString() {
                return "Role{" +
                        "id=" + id +
                        ", roleName='" + roleName + '\'' +
                        ", roleDesc='" + roleDesc + '\'' +
                        '}';
        }

        public Role() {
        }

        public Role(Integer id, String roleName, String roleDesc) {
                this.id = id;
                this.roleName = roleName;
                this.roleDesc = roleDesc;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getRoleName() {
                return roleName;
        }

        public void setRoleName(String roleName) {
                this.roleName = roleName;
        }

        public String getRoleDesc() {
                return roleDesc;
        }

        public void setRoleDesc(String roleDesc) {
                this.roleDesc = roleDesc;
        }
}
