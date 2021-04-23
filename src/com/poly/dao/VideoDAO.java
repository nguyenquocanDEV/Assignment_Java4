package com.poly.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.poly.common.JPAUtils;
import com.poly.model.Favorite;
import com.poly.model.Video;

public class VideoDAO extends AbstractEntityDAO<Video> {

    public VideoDAO() {
	super(Video.class);

    }

    EntityManager em = JPAUtils.getEntityManager();

    /*
     * Fill all Video
     */
    @SuppressWarnings("finally")
    public List<Video> findAllVideo() {

	List<Video> listVideo = null;
	try {
	    String hql = "Select u from Videos u";
	    TypedQuery<Video> query = em.createQuery(hql, Video.class);
	    listVideo = query.getResultList();
	} catch (Exception e) {
	    System.out.println(e.toString());
	    // TODO: handle exception
	} finally {
	    return listVideo;
	}

    }

    public Video getVideoByFaverId(int faverID) {

	return em.find(Favorite.class, faverID).getVideo();
    }

}
