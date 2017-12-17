package com.rs.game.player.content.jobs;

import java.io.Serializable;

/**
 * @Author arrow
 * @Contact<arrowrsps@gmail.com;skype:arrowrsps>
 */

    public enum Jobs implements Serializable {
        CADMUS(0),
        JULIAN(1),
        APPRENTICE_SMITH(2),
        BANANA_PLANTATION(3),
        GATHERER_MISCELLAN(4),
        WOODCUTTER_MISCELLANIA(5),
        
        ;

        private int index;

        /**
         * Quests parameter index
         *
         * @param index
         */
        private Jobs(int index) {
            this.index = index;
        }

        /**
         * Gets the index of the job.
         *
         * @return index
         */
        public int index() {
            return index;
        }

        /**
         * Returns the job value
         *
         * @param id
         * @return job
         */
        public static Jobs get(int id) {
            for (Jobs job : Jobs.values()) {
                if (job.index() == id)
                    return job;
            }

            return null;
        }
}
