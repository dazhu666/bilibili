package bilibili

class Movie {

    /**
     * ��Ƶ����(����)
     */
    String title

    /**
     * ��Ƶ��������
     */
    String content

    /**
     * ����
     */
    String author

    /**
     * ��������
     */
    Date issueDate

    /**
     * ��Ƶ�Ĵ洢·��
     */
    String movieUrl

    /**
     * ����ʱ��
     */
    Date dateCreated

    /**
     * ������ʱ��
     */
    Date lastUpdated

    /**
     * ��Ƶ�����url
     */
    String movieImageUrl

    /**
     * �������
     */
    Long clickCount
    static constraints = {
        title     nullable: true,maxSize: 255
        content   nullable: true,maxSize: 1000
        author    nullable: true
        movieUrl  nullable: true,maxSize: 300
    }
}
