package bilibili

class SysUser {

    /**
     * �û�����
     */
    String name

    /**
     * �ֻ�����
     */
    String mobile

    /**
     * ��¼��
     */
    String login

    /**
     * ����
     */
    String password

    /**
     * ����
     */
    Integer age=0

    /**
     * ��ַ
     */
    String address

    /**
     * ����ʱ��
     */
    Date dateCreated

    /**
     * ����ʱ��
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
