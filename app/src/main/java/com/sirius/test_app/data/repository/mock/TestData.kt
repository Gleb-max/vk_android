package com.sirius.test_app.data.repository.mock

import com.sirius.test_app.domain.entity.ActionModel
import com.sirius.test_app.domain.entity.DataModel
import com.sirius.test_app.domain.entity.ReviewModel
import com.sirius.test_app.domain.entity.VideoModel

val dataTestModel = DataModel(
    image = "https://i.ibb.co/L8K5gCF/img-background.png",
    logo = "https://i.ibb.co/Pjf2B69/img-logo.png",
    name = "DoTA 2",
    rating = 4.9f,
    gradeCnt = "70M",
    tags = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
    videos = listOf(
        VideoModel(id = "video_1", image = "https://ibb.co/q7dyBVH"),
        VideoModel(id = "video_2", image = "https://ibb.co/S3GymhJ")
    ),
    description = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
    reviews = listOf(
        ReviewModel(
            id = 1,
            userImage = "https://i.ibb.co/Hr8b3ms/img-user-1.png",
            userName = "Auguste Conte",
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        ),
        ReviewModel(
            id = 2,
            userImage = "https://i.ibb.co/mRph0tF/img-user-2.png",
            userName = "Jang Marcelino",
            date = "February 14, 2019",
            message =
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
    action = ActionModel(
        name = "Install",
        action = "action_install"
    )
)