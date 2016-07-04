package bilibili

class SysUser {

    /**
     * 用户姓名
     */
    String name

    /**
     * 手机号码
     */
    String mobile

    /**
     * 登录名
     */
    String login

    /**
     * 密码
     */
    String password

    /**
     * 年龄
     */
    Integer age=0

    /**
     * 地址
     */
    String address

    /**
     * 创建时间
     */
    Date dateCreated

    /**
     * 更新时间
     */
    Date lastUpdated

    static constraints = {
        name        nullable: true
        mobile      nullable: true
        login       nullable: false
        password    nullable: false
        address     nullable: true

    }
}
