package com.cem.cs443.urlredirectservice.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "url_records")
@Getter
@Setter
@NoArgsConstructor
public class UrlLink
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "user_id", nullable = false)
    Long userId;

    @Temporal(TemporalType.DATE)
    Date expirationTime;

    @Column(nullable = false)
    Boolean isExpired;

    @Column(nullable = false)
    Integer hitCount;

    @Column(name = "short_url", unique = true)
    private String shortUrl;

    @Column(name = "target_url")
    private String originalUrl;

    public UrlLink(Long userId, String originalUrl, String shortUrl, Date expirationTime) {
        this.id = id;
        this.userId = userId;
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.expirationTime = expirationTime;
        this.isExpired = Boolean.FALSE;
        this.hitCount = 0;
    }

    public void incrementHitcount()
    {
        hitCount++;
    }
}
