package bilibili

//操作记录表
class OperationRecord {

    /**
     * 用户id
     */
    Long sysUserId

    /**
     * 用户姓名
     */
    String sysUserName

    /**
     * 操作的domain名称
     */
    String domainClassName

    /**
     * 创建时间
     */
    Date dateCreated

    /**
     * 更新时间
     */
    Date lastUpdated

    /**
     * 操作的动作
     */
    String operated
    static constraints = {
    }
}
