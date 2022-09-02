package org.aaa.api;

/**
 * @Author:江Sir
 * @Date:30 2022/08/30 09:23
 * @description: Exercise
 * @Version 1.0.0
 */
public class RoleTest {
    private Integer id;
    private String userName;
    private String birthday;
    private String sex;
    private String address;
    private String roleId;
    private String roleName;
    private String roleDesc;

    public RoleTest() {
    }

    public RoleTest(Integer id, String userName, String birthday, String sex, String address, String roleId, String roleName, String roleDesc) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return "RoleTest{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
