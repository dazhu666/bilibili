package bilibili

//������¼��
class OperationRecord {

    /**
     * �û�id
     */
    Long sysUserId

    /**
     * �û�����
     */
    String sysUserName

    /**
     * ������domain����
     */
    String domainClassName

    /**
     * ����ʱ��
     */
    Date dateCreated

    /**
     * ����ʱ��
     */
    Date lastUpdated

    /**
     * �����Ķ���
     */
    String operated
    static constraints = {
    }
}
