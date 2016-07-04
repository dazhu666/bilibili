package bilibili

class Movie {

    /**
     * 视频名称(标题)
     */
    String title

    /**
     * 视频描述内容
     */
    String content

    /**
     * 作者
     */
    String author

    /**
     * 发行日期
     */
    Date issueDate

    /**
     * 视频的存储路径
     */
    String movieUrl

    /**
     * 创建时间
     */
    Date dateCreated

    /**
     * 最后更新时间
     */
    Date lastUpdated

    /**
     * 视频封面的url
     */
    String movieImageUrl

    /**
     * 点击数量
     */
    Long clickCount
    static constraints = {
        title     nullable: true,maxSize: 255
        content   nullable: true,maxSize: 1000
        author    nullable: true
        movieUrl  nullable: true,maxSize: 300
    }
}
